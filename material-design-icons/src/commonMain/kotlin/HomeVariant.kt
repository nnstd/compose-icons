package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeVariant: ImageVector
    get() {
        if (_HomeVariant != null) {
            return _HomeVariant!!
        }
        _HomeVariant = ImageVector.Builder(
            name = "HomeVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(20f, 9f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                lineTo(12f, 3f)
                close()
            }
        }.build()

        return _HomeVariant!!
    }

@Suppress("ObjectPropertyName")
private var _HomeVariant: ImageVector? = null
