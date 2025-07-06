package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookSettingsOutline: ImageVector
    get() {
        if (_BookSettingsOutline != null) {
            return _BookSettingsOutline!!
        }
        _BookSettingsOutline = ImageVector.Builder(
            name = "BookSettingsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                horizontalLineTo(6f)
                curveTo(4.89f, 0f, 4f, 0.895f, 4f, 2f)
                verticalLineTo(18f)
                curveTo(4f, 19.11f, 4.89f, 20f, 6f, 20f)
                horizontalLineTo(18f)
                curveTo(19.11f, 20f, 20f, 19.11f, 20f, 18f)
                verticalLineTo(2f)
                curveTo(20f, 0.895f, 19.11f, 0f, 18f, 0f)
                moveTo(18f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                lineTo(10.5f, 7.75f)
                lineTo(13f, 10f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                moveTo(7f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(11f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _BookSettingsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookSettingsOutline: ImageVector? = null
