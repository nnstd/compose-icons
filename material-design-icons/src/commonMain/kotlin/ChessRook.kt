package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChessRook: ImageVector
    get() {
        if (_ChessRook != null) {
            return _ChessRook!!
        }
        _ChessRook = ImageVector.Builder(
            name = "ChessRook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 20f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                moveTo(17f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(2f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _ChessRook!!
    }

@Suppress("ObjectPropertyName")
private var _ChessRook: ImageVector? = null
