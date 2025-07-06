package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StairsDown: ImageVector
    get() {
        if (_StairsDown != null) {
            return _StairsDown!!
        }
        _StairsDown = ImageVector.Builder(
            name = "StairsDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                moveTo(4.83f, 8.34f)
                lineTo(10.34f, 2.83f)
                lineTo(12.17f, 4.66f)
                lineTo(6.66f, 10.17f)
                lineTo(8.5f, 12f)
                horizontalLineTo(3f)
                verticalLineTo(6.5f)
                lineTo(4.83f, 8.34f)
                close()
            }
        }.build()

        return _StairsDown!!
    }

@Suppress("ObjectPropertyName")
private var _StairsDown: ImageVector? = null
