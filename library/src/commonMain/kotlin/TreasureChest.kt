package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TreasureChest: ImageVector
    get() {
        if (_TreasureChest != null) {
            return _TreasureChest!!
        }
        _TreasureChest = ImageVector.Builder(
            name = "TreasureChest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 4f)
                horizontalLineTo(19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 4f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                moveTo(2f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                lineTo(11f, 15f)
                horizontalLineTo(13f)
                lineTo(15f, 13f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _TreasureChest!!
    }

@Suppress("ObjectPropertyName")
private var _TreasureChest: ImageVector? = null
