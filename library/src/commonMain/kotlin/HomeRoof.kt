package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeRoof: ImageVector
    get() {
        if (_HomeRoof != null) {
            return _HomeRoof!!
        }
        _HomeRoof = ImageVector.Builder(
            name = "HomeRoof",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 16f)
                horizontalLineTo(22f)
                lineTo(12f, 7f)
                lineTo(2f, 16f)
                horizontalLineTo(5f)
                lineTo(12f, 9.69f)
                lineTo(19f, 16f)
                moveTo(7f, 8.81f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(11.5f)
                lineTo(7f, 8.81f)
                close()
            }
        }.build()

        return _HomeRoof!!
    }

@Suppress("ObjectPropertyName")
private var _HomeRoof: ImageVector? = null
