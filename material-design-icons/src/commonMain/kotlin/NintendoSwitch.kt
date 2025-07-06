package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NintendoSwitch: ImageVector
    get() {
        if (_NintendoSwitch != null) {
            return _NintendoSwitch!!
        }
        _NintendoSwitch = ImageVector.Builder(
            name = "NintendoSwitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.04f, 20.4f)
                horizontalLineTo(7.12f)
                curveTo(6.19f, 20.4f, 5.3f, 20f, 4.64f, 19.36f)
                curveTo(4f, 18.7f, 3.6f, 17.81f, 3.6f, 16.88f)
                verticalLineTo(7.12f)
                curveTo(3.6f, 6.19f, 4f, 5.3f, 4.64f, 4.64f)
                curveTo(5.3f, 4f, 6.19f, 3.62f, 7.12f, 3.62f)
                horizontalLineTo(10.04f)
                verticalLineTo(20.4f)
                moveTo(7.12f, 2f)
                arcTo(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7.12f)
                verticalLineTo(16.88f)
                curveTo(2f, 19.71f, 4.29f, 22f, 7.12f, 22f)
                horizontalLineTo(11.65f)
                verticalLineTo(2f)
                horizontalLineTo(7.12f)
                moveTo(5.11f, 8f)
                curveTo(5.11f, 9.04f, 5.95f, 9.88f, 7f, 9.88f)
                curveTo(8.03f, 9.88f, 8.87f, 9.04f, 8.87f, 8f)
                curveTo(8.87f, 6.96f, 8.03f, 6.12f, 7f, 6.12f)
                curveTo(5.95f, 6.12f, 5.11f, 6.96f, 5.11f, 8f)
                moveTo(17.61f, 11f)
                curveTo(18.72f, 11f, 19.62f, 11.89f, 19.62f, 13f)
                curveTo(19.62f, 14.12f, 18.72f, 15f, 17.61f, 15f)
                curveTo(16.5f, 15f, 15.58f, 14.12f, 15.58f, 13f)
                curveTo(15.58f, 11.89f, 16.5f, 11f, 17.61f, 11f)
                moveTo(16.88f, 22f)
                arcTo(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16.88f)
                verticalLineTo(7.12f)
                curveTo(22f, 4.29f, 19.71f, 2f, 16.88f, 2f)
                horizontalLineTo(13.65f)
                verticalLineTo(22f)
                horizontalLineTo(16.88f)
                close()
            }
        }.build()

        return _NintendoSwitch!!
    }

@Suppress("ObjectPropertyName")
private var _NintendoSwitch: ImageVector? = null
