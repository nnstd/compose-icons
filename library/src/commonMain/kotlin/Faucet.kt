package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Faucet: ImageVector
    get() {
        if (_Faucet != null) {
            return _Faucet!!
        }
        _Faucet = ImageVector.Builder(
            name = "Faucet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(14.28f)
                lineTo(19f, 14f)
                moveTo(19f, 13f)
                curveTo(19f, 11.9f, 18f, 11f, 16.8f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(13.91f)
                lineTo(19f, 13f)
                moveTo(5f, 9f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                lineTo(15.36f, 5.21f)
                curveTo(15.74f, 5.09f, 16f, 4.73f, 16f, 4.33f)
                curveTo(16f, 3.68f, 15.36f, 3.23f, 14.75f, 3.45f)
                lineTo(5f, 7f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Faucet!!
    }

@Suppress("ObjectPropertyName")
private var _Faucet: ImageVector? = null
