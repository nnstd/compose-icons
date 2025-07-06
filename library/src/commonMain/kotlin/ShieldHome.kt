package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldHome: ImageVector
    get() {
        if (_ShieldHome != null) {
            return _ShieldHome!!
        }
        _ShieldHome = ImageVector.Builder(
            name = "ShieldHome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                lineTo(12f, 6f)
                lineTo(6f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                curveTo(21f, 16.55f, 17.16f, 21.74f, 12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                close()
            }
        }.build()

        return _ShieldHome!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldHome: ImageVector? = null
