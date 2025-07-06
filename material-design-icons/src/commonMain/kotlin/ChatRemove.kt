package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChatRemove: ImageVector
    get() {
        if (_ChatRemove != null) {
            return _ChatRemove!!
        }
        _ChatRemove = ImageVector.Builder(
            name = "ChatRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.46f, 15.88f)
                lineTo(16.88f, 14.46f)
                lineTo(19f, 16.59f)
                lineTo(21.12f, 14.47f)
                lineTo(22.54f, 15.88f)
                lineTo(20.41f, 18f)
                lineTo(22.54f, 20.12f)
                lineTo(21.12f, 21.54f)
                lineTo(19f, 19.41f)
                lineTo(16.88f, 21.54f)
                lineTo(15.46f, 20.12f)
                lineTo(17.59f, 18f)
                lineTo(15.47f, 15.88f)
                moveTo(12f, 3f)
                curveTo(17.5f, 3f, 22f, 6.58f, 22f, 11f)
                curveTo(22f, 11.58f, 21.92f, 12.14f, 21.78f, 12.68f)
                curveTo(20.95f, 12.25f, 20f, 12f, 19f, 12f)
                curveTo(15.69f, 12f, 13f, 14.69f, 13f, 18f)
                lineTo(13.08f, 18.95f)
                lineTo(12f, 19f)
                curveTo(10.76f, 19f, 9.57f, 18.82f, 8.47f, 18.5f)
                curveTo(5.55f, 21f, 2f, 21f, 2f, 21f)
                curveTo(4.33f, 18.67f, 4.7f, 17.1f, 4.75f, 16.5f)
                curveTo(3.05f, 15.07f, 2f, 13.14f, 2f, 11f)
                curveTo(2f, 6.58f, 6.5f, 3f, 12f, 3f)
                close()
            }
        }.build()

        return _ChatRemove!!
    }

@Suppress("ObjectPropertyName")
private var _ChatRemove: ImageVector? = null
