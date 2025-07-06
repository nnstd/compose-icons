package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiamondStone: ImageVector
    get() {
        if (_DiamondStone != null) {
            return _DiamondStone!!
        }
        _DiamondStone = ImageVector.Builder(
            name = "DiamondStone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                horizontalLineTo(19f)
                lineTo(14f, 16f)
                moveTo(10f, 9f)
                horizontalLineTo(14f)
                lineTo(12f, 17f)
                moveTo(5f, 9f)
                horizontalLineTo(8f)
                lineTo(10f, 16f)
                moveTo(15f, 4f)
                horizontalLineTo(17f)
                lineTo(19f, 7f)
                horizontalLineTo(16f)
                moveTo(11f, 4f)
                horizontalLineTo(13f)
                lineTo(14f, 7f)
                horizontalLineTo(10f)
                moveTo(7f, 4f)
                horizontalLineTo(9f)
                lineTo(8f, 7f)
                horizontalLineTo(5f)
                moveTo(6f, 2f)
                lineTo(2f, 8f)
                lineTo(12f, 22f)
                lineTo(22f, 8f)
                lineTo(18f, 2f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _DiamondStone!!
    }

@Suppress("ObjectPropertyName")
private var _DiamondStone: ImageVector? = null
