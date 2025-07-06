package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RhombusSplitOutline: ImageVector
    get() {
        if (_RhombusSplitOutline != null) {
            return _RhombusSplitOutline!!
        }
        _RhombusSplitOutline = ImageVector.Builder(
            name = "RhombusSplitOutline",
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
                lineTo(15.29f, 7.29f)
                lineTo(12f, 10.59f)
                lineTo(8.71f, 7.29f)
                lineTo(12f, 4f)
                moveTo(7.29f, 8.71f)
                lineTo(10.59f, 12f)
                lineTo(7.29f, 15.29f)
                lineTo(4f, 12f)
                lineTo(7.29f, 8.71f)
                moveTo(16.71f, 8.71f)
                lineTo(20f, 12f)
                lineTo(16.71f, 15.29f)
                lineTo(13.41f, 12f)
                lineTo(16.71f, 8.71f)
                moveTo(12f, 13.41f)
                lineTo(15.29f, 16.71f)
                lineTo(12f, 20f)
                lineTo(8.71f, 16.71f)
                lineTo(12f, 13.41f)
                close()
            }
        }.build()

        return _RhombusSplitOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RhombusSplitOutline: ImageVector? = null
