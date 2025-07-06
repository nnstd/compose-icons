package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeSwitchOutline: ImageVector
    get() {
        if (_HomeSwitchOutline != null) {
            return _HomeSwitchOutline!!
        }
        _HomeSwitchOutline = ImageVector.Builder(
            name = "HomeSwitchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 3f)
                lineTo(1f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                lineTo(8f, 3f)
                moveTo(11.5f, 9f)
                verticalLineTo(13.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(8f)
                lineTo(8f, 5f)
                lineTo(11.5f, 8f)
                verticalLineTo(9f)
                moveTo(9f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                lineTo(18f, 19f)
                lineTo(15f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                lineTo(6f, 19f)
                lineTo(9f, 16f)
                moveTo(23f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                lineTo(13.54f, 5.11f)
                lineTo(16f, 3f)
                lineTo(23f, 9f)
                close()
            }
        }.build()

        return _HomeSwitchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeSwitchOutline: ImageVector? = null
