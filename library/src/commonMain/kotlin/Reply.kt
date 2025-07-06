package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Reply: ImageVector
    get() {
        if (_Reply != null) {
            return _Reply!!
        }
        _Reply = ImageVector.Builder(
            name = "Reply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 9f)
                verticalLineTo(5f)
                lineTo(3f, 12f)
                lineTo(10f, 19f)
                verticalLineTo(14.9f)
                curveTo(15f, 14.9f, 18.5f, 16.5f, 21f, 20f)
                curveTo(20f, 15f, 17f, 10f, 10f, 9f)
                close()
            }
        }.build()

        return _Reply!!
    }

@Suppress("ObjectPropertyName")
private var _Reply: ImageVector? = null
