package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeParentheses: ImageVector
    get() {
        if (_CodeParentheses != null) {
            return _CodeParentheses!!
        }
        _CodeParentheses = ImageVector.Builder(
            name = "CodeParentheses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.62f, 3f)
                curveTo(19.13f, 5.27f, 20f, 8.55f, 20f, 12f)
                curveTo(20f, 15.44f, 19.13f, 18.72f, 17.62f, 21f)
                lineTo(16f, 19.96f)
                curveTo(17.26f, 18.07f, 18f, 15.13f, 18f, 12f)
                curveTo(18f, 8.87f, 17.26f, 5.92f, 16f, 4.03f)
                lineTo(17.62f, 3f)
                moveTo(6.38f, 3f)
                lineTo(8f, 4.04f)
                curveTo(6.74f, 5.92f, 6f, 8.87f, 6f, 12f)
                curveTo(6f, 15.13f, 6.74f, 18.08f, 8f, 19.96f)
                lineTo(6.38f, 21f)
                curveTo(4.87f, 18.73f, 4f, 15.45f, 4f, 12f)
                curveTo(4f, 8.55f, 4.87f, 5.27f, 6.38f, 3f)
                close()
            }
        }.build()

        return _CodeParentheses!!
    }

@Suppress("ObjectPropertyName")
private var _CodeParentheses: ImageVector? = null
