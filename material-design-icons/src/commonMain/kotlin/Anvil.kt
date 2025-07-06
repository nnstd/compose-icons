package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Anvil: ImageVector
    get() {
        if (_Anvil != null) {
            return _Anvil!!
        }
        _Anvil = ImageVector.Builder(
            name = "Anvil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 5f)
                verticalLineTo(10f)
                curveTo(13.03f, 12.47f, 8.44f, 14.97f, 6f, 16f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                curveTo(14.59f, 13.27f, 17.47f, 9f, 22f, 8f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                moveTo(2f, 6f)
                curveTo(2.81f, 8.13f, 4.42f, 9.5f, 7f, 10f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _Anvil!!
    }

@Suppress("ObjectPropertyName")
private var _Anvil: ImageVector? = null
