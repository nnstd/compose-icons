package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShareAll: ImageVector
    get() {
        if (_ShareAll != null) {
            return _ShareAll!!
        }
        _ShareAll = ImageVector.Builder(
            name = "ShareAll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9f)
                verticalLineTo(5f)
                lineTo(18f, 12f)
                lineTo(11f, 19f)
                verticalLineTo(14.9f)
                curveTo(6f, 14.9f, 2.5f, 16.5f, 0f, 20f)
                curveTo(1f, 15f, 4f, 10f, 11f, 9f)
                moveTo(17f, 8f)
                verticalLineTo(5f)
                lineTo(24f, 12f)
                lineTo(17f, 19f)
                verticalLineTo(16f)
                lineTo(21f, 12f)
                lineTo(17f, 8f)
                close()
            }
        }.build()

        return _ShareAll!!
    }

@Suppress("ObjectPropertyName")
private var _ShareAll: ImageVector? = null
