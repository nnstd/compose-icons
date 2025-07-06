package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlertOctagram: ImageVector
    get() {
        if (_AlertOctagram != null) {
            return _AlertOctagram!!
        }
        _AlertOctagram = ImageVector.Builder(
            name = "AlertOctagram",
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
                moveTo(13f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(13f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _AlertOctagram!!
    }

@Suppress("ObjectPropertyName")
private var _AlertOctagram: ImageVector? = null
