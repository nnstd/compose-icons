package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloseOctagon: ImageVector
    get() {
        if (_CloseOctagon != null) {
            return _CloseOctagon!!
        }
        _CloseOctagon = ImageVector.Builder(
            name = "CloseOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.27f, 3f)
                lineTo(3f, 8.27f)
                verticalLineTo(15.73f)
                lineTo(8.27f, 21f)
                horizontalLineTo(15.73f)
                lineTo(21f, 15.73f)
                verticalLineTo(8.27f)
                lineTo(15.73f, 3f)
                moveTo(8.41f, 7f)
                lineTo(12f, 10.59f)
                lineTo(15.59f, 7f)
                lineTo(17f, 8.41f)
                lineTo(13.41f, 12f)
                lineTo(17f, 15.59f)
                lineTo(15.59f, 17f)
                lineTo(12f, 13.41f)
                lineTo(8.41f, 17f)
                lineTo(7f, 15.59f)
                lineTo(10.59f, 12f)
                lineTo(7f, 8.41f)
            }
        }.build()

        return _CloseOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _CloseOctagon: ImageVector? = null
