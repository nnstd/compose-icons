package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Transition: ImageVector
    get() {
        if (_Transition != null) {
            return _Transition!!
        }
        _Transition = ImageVector.Builder(
            name = "Transition",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 9f)
                curveTo(22f, 11.71f, 20.46f, 14.05f, 18.22f, 15.22f)
                curveTo(17.55f, 16.5f, 16.5f, 17.55f, 15.22f, 18.22f)
                curveTo(14.05f, 20.46f, 11.71f, 22f, 9f, 22f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 15f)
                curveTo(2f, 12.29f, 3.54f, 9.95f, 5.78f, 8.78f)
                curveTo(6.45f, 7.5f, 7.5f, 6.45f, 8.78f, 5.78f)
                curveTo(9.95f, 3.54f, 12.29f, 2f, 15f, 2f)
                moveTo(12f, 19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12f)
                curveTo(4.37f, 12.84f, 4f, 13.87f, 4f, 15f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                curveTo(10.13f, 20f, 11.16f, 19.63f, 12f, 19f)
                moveTo(15f, 16f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 9f)
                horizontalLineTo(8f)
                curveTo(7.37f, 9.84f, 7f, 10.87f, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                curveTo(13.13f, 17f, 14.16f, 16.63f, 15f, 16f)
                verticalLineTo(16f)
                moveTo(15f, 4f)
                curveTo(13.87f, 4f, 12.84f, 4.37f, 12f, 5f)
                verticalLineTo(5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
                horizontalLineTo(19f)
                curveTo(19.63f, 11.16f, 20f, 10.13f, 20f, 9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 4f)
                moveTo(10f, 9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14f)
                curveTo(15.6f, 14f, 16.17f, 13.9f, 16.7f, 13.7f)
                curveTo(16.9f, 13.17f, 17f, 12.6f, 17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                curveTo(11.4f, 7f, 10.83f, 7.1f, 10.3f, 7.3f)
                curveTo(10.1f, 7.83f, 10f, 8.4f, 10f, 9f)
                close()
            }
        }.build()

        return _Transition!!
    }

@Suppress("ObjectPropertyName")
private var _Transition: ImageVector? = null
