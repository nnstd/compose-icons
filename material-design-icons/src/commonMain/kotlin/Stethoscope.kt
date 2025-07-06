package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Stethoscope: ImageVector
    get() {
        if (_Stethoscope != null) {
            return _Stethoscope!!
        }
        _Stethoscope = ImageVector.Builder(
            name = "Stethoscope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                curveTo(19.56f, 8f, 20f, 8.43f, 20f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 10f)
                curveTo(18.43f, 10f, 18f, 9.55f, 18f, 9f)
                curveTo(18f, 8.43f, 18.43f, 8f, 19f, 8f)
                moveTo(2f, 2f)
                verticalLineTo(11f)
                curveTo(2f, 13.96f, 4.19f, 16.5f, 7.14f, 16.91f)
                curveTo(7.76f, 19.92f, 10.42f, 22f, 13.5f, 22f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 15.5f)
                verticalLineTo(11.81f)
                curveTo(21.16f, 11.39f, 22f, 10.29f, 22f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 9f)
                curveTo(16f, 10.29f, 16.84f, 11.4f, 18f, 11.81f)
                verticalLineTo(15.41f)
                curveTo(18f, 17.91f, 16f, 19.91f, 13.5f, 19.91f)
                curveTo(11.5f, 19.91f, 9.82f, 18.7f, 9.22f, 16.9f)
                curveTo(12f, 16.3f, 14f, 13.8f, 14f, 11f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 11f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _Stethoscope!!
    }

@Suppress("ObjectPropertyName")
private var _Stethoscope: ImageVector? = null
