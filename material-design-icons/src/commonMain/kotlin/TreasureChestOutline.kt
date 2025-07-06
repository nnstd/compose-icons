package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TreasureChestOutline: ImageVector
    get() {
        if (_TreasureChestOutline != null) {
            return _TreasureChestOutline!!
        }
        _TreasureChestOutline = ImageVector.Builder(
            name = "TreasureChestOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                curveTo(22f, 6.2f, 21.68f, 5.44f, 21.12f, 4.88f)
                curveTo(20.56f, 4.32f, 19.8f, 4f, 19f, 4f)
                horizontalLineTo(5f)
                curveTo(4.2f, 4f, 3.44f, 4.32f, 2.88f, 4.88f)
                curveTo(2.32f, 5.44f, 2f, 6.2f, 2f, 7f)
                verticalLineTo(20f)
                moveTo(20f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                curveTo(4f, 6.74f, 4.11f, 6.5f, 4.29f, 6.29f)
                curveTo(4.5f, 6.11f, 4.74f, 6f, 5f, 6f)
                horizontalLineTo(19f)
                curveTo(19.27f, 6f, 19.5f, 6.11f, 19.71f, 6.29f)
                curveTo(19.9f, 6.5f, 20f, 6.74f, 20f, 7f)
                verticalLineTo(11f)
                moveTo(15f, 13f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                lineTo(11f, 15f)
                horizontalLineTo(13f)
                lineTo(15f, 13f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _TreasureChestOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TreasureChestOutline: ImageVector? = null
