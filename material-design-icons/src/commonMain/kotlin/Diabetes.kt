package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Diabetes: ImageVector
    get() {
        if (_Diabetes != null) {
            return _Diabetes!!
        }
        _Diabetes = ImageVector.Builder(
            name = "Diabetes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.73f, 2.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.14f, 3.7f)
                lineTo(13f, 6.79f)
                lineTo(13.76f, 7.74f)
                lineTo(15.7f, 12.74f)
                arcTo(1.46f, 1.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.36f, 14.29f)
                lineTo(12.27f, 17.38f)
                arcTo(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.15f, 17.38f)
                lineTo(5.55f, 12.78f)
                arcTo(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.15f, 11.78f)
                lineTo(4.65f, 5.34f)
                horizontalLineTo(5.72f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.47f, 5.64f)
                lineTo(6.61f, 5.81f)
                lineTo(7.66f, 9.29f)
                moveTo(7.66f, 22f)
                lineTo(2f, 16.36f)
                lineTo(4.12f, 14.24f)
                lineTo(9.78f, 19.9f)
                moveTo(19.5f, 4.5f)
                reflectiveCurveTo(17f, 7.26f, 17f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22f, 9f)
                curveTo(22f, 7.26f, 19.5f, 4.5f, 19.5f, 4.5f)
                close()
            }
        }.build()

        return _Diabetes!!
    }

@Suppress("ObjectPropertyName")
private var _Diabetes: ImageVector? = null
