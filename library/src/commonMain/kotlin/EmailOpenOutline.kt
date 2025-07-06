package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailOpenOutline: ImageVector
    get() {
        if (_EmailOpenOutline != null) {
            return _EmailOpenOutline!!
        }
        _EmailOpenOutline = ImageVector.Builder(
            name = "EmailOpenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.03f, 6.29f)
                lineTo(12f, 0.64f)
                lineTo(2.97f, 6.29f)
                curveTo(2.39f, 6.64f, 2f, 7.27f, 2f, 8f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(8f)
                curveTo(22f, 7.27f, 21.61f, 6.64f, 21.03f, 6.29f)
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                lineTo(12f, 15f)
                lineTo(20f, 10f)
                verticalLineTo(18f)
                moveTo(12f, 13f)
                lineTo(4f, 8f)
                lineTo(12f, 3f)
                lineTo(20f, 8f)
                lineTo(12f, 13f)
                close()
            }
        }.build()

        return _EmailOpenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmailOpenOutline: ImageVector? = null
