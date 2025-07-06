package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertOctagramOutline: ImageVector
    get() {
        if (_AlertOctagramOutline != null) {
            return _AlertOctagramOutline!!
        }
        _AlertOctagramOutline = ImageVector.Builder(
            name = "AlertOctagramOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.2f, 16.06f)
                lineTo(3.88f, 12f)
                lineTo(2.2f, 7.94f)
                lineTo(6.26f, 6.26f)
                lineTo(7.94f, 2.2f)
                lineTo(12f, 3.88f)
                lineTo(16.06f, 2.2f)
                lineTo(17.74f, 6.26f)
                lineTo(21.8f, 7.94f)
                lineTo(20.12f, 12f)
                lineTo(21.8f, 16.06f)
                lineTo(17.74f, 17.74f)
                lineTo(16.06f, 21.8f)
                lineTo(12f, 20.12f)
                lineTo(7.94f, 21.8f)
                lineTo(6.26f, 17.74f)
                lineTo(2.2f, 16.06f)
                moveTo(4.81f, 9f)
                lineTo(6.05f, 12f)
                lineTo(4.81f, 15f)
                lineTo(7.79f, 16.21f)
                lineTo(9f, 19.19f)
                lineTo(12f, 17.95f)
                lineTo(15f, 19.19f)
                lineTo(16.21f, 16.21f)
                lineTo(19.19f, 15f)
                lineTo(17.95f, 12f)
                lineTo(19.19f, 9f)
                lineTo(16.21f, 7.79f)
                lineTo(15f, 4.81f)
                lineTo(12f, 6.05f)
                lineTo(9f, 4.81f)
                lineTo(7.79f, 7.79f)
                lineTo(4.81f, 9f)
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(11f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
            }
        }.build()

        return _AlertOctagramOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlertOctagramOutline: ImageVector? = null
