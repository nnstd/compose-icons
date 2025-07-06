package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertRhombusOutline: ImageVector
    get() {
        if (_AlertRhombusOutline != null) {
            return _AlertRhombusOutline!!
        }
        _AlertRhombusOutline = ImageVector.Builder(
            name = "AlertRhombusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(11.5f, 2f, 11f, 2.19f, 10.59f, 2.59f)
                lineTo(2.59f, 10.59f)
                curveTo(1.8f, 11.37f, 1.8f, 12.63f, 2.59f, 13.41f)
                lineTo(10.59f, 21.41f)
                curveTo(11.37f, 22.2f, 12.63f, 22.2f, 13.41f, 21.41f)
                lineTo(21.41f, 13.41f)
                curveTo(22.2f, 12.63f, 22.2f, 11.37f, 21.41f, 10.59f)
                lineTo(13.41f, 2.59f)
                curveTo(13f, 2.19f, 12.5f, 2f, 12f, 2f)
                moveTo(12f, 4f)
                lineTo(20f, 12f)
                lineTo(12f, 20f)
                lineTo(4f, 12f)
                moveTo(11f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                moveTo(11f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _AlertRhombusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlertRhombusOutline: ImageVector? = null
