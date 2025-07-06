package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ListStatus: ImageVector
    get() {
        if (_ListStatus != null) {
            return _ListStatus!!
        }
        _ListStatus = ImageVector.Builder(
            name = "ListStatus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 11f)
                lineTo(13f, 7.5f)
                lineTo(14.4f, 6.1f)
                lineTo(16.5f, 8.2f)
                lineTo(20.7f, 4f)
                lineTo(22.1f, 5.4f)
                lineTo(16.5f, 11f)
                moveTo(11f, 7f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                moveTo(21f, 13.4f)
                lineTo(19.6f, 12f)
                lineTo(17f, 14.6f)
                lineTo(14.4f, 12f)
                lineTo(13f, 13.4f)
                lineTo(15.6f, 16f)
                lineTo(13f, 18.6f)
                lineTo(14.4f, 20f)
                lineTo(17f, 17.4f)
                lineTo(19.6f, 20f)
                lineTo(21f, 18.6f)
                lineTo(18.4f, 16f)
                lineTo(21f, 13.4f)
                moveTo(11f, 15f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _ListStatus!!
    }

@Suppress("ObjectPropertyName")
private var _ListStatus: ImageVector? = null
