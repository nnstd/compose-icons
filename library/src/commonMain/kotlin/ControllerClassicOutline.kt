package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ControllerClassicOutline: ImageVector
    get() {
        if (_ControllerClassicOutline != null) {
            return _ControllerClassicOutline!!
        }
        _ControllerClassicOutline = ImageVector.Builder(
            name = "ControllerClassicOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 7f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 12.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 18f)
                curveTo(15.79f, 18f, 14.27f, 17.22f, 13.26f, 16f)
                horizontalLineTo(10.74f)
                curveTo(9.73f, 17.22f, 8.21f, 18f, 6.5f, 18f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 12.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 7f)
                horizontalLineTo(17.5f)
                moveTo(6.5f, 9f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 16f)
                curveTo(7.9f, 16f, 9.1f, 15.18f, 9.66f, 14f)
                horizontalLineTo(14.34f)
                curveTo(14.9f, 15.18f, 16.1f, 16f, 17.5f, 16f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 9f)
                horizontalLineTo(6.5f)
                moveTo(5.75f, 10.25f)
                horizontalLineTo(7.25f)
                verticalLineTo(11.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(13.25f)
                horizontalLineTo(7.25f)
                verticalLineTo(14.75f)
                horizontalLineTo(5.75f)
                verticalLineTo(13.25f)
                horizontalLineTo(4.25f)
                verticalLineTo(11.75f)
                horizontalLineTo(5.75f)
                verticalLineTo(10.25f)
                moveTo(16.75f, 12.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.75f, 13.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.75f, 14.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.75f, 13.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.75f, 12.5f)
                moveTo(18.75f, 10.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.75f, 11.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.75f, 12.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.75f, 11.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.75f, 10.5f)
                close()
            }
        }.build()

        return _ControllerClassicOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ControllerClassicOutline: ImageVector? = null
