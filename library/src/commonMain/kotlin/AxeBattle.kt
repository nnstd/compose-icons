package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AxeBattle: ImageVector
    get() {
        if (_AxeBattle != null) {
            return _AxeBattle!!
        }
        _AxeBattle = ImageVector.Builder(
            name = "AxeBattle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.47f, 12.43f)
                curveTo(19.35f, 14.55f, 15.82f, 13.84f, 15.82f, 13.84f)
                verticalLineTo(9.6f)
                lineTo(3.41f, 22f)
                lineTo(2f, 20.59f)
                lineTo(14.4f, 8.18f)
                horizontalLineTo(10.16f)
                curveTo(10.16f, 8.18f, 9.45f, 4.65f, 11.57f, 2.53f)
                curveTo(13.69f, 0.406f, 17.23f, 1.11f, 17.23f, 1.11f)
                verticalLineTo(5.36f)
                lineTo(17.94f, 4.65f)
                lineTo(19.35f, 6.06f)
                lineTo(18.64f, 6.77f)
                horizontalLineTo(22.89f)
                curveTo(22.89f, 6.77f, 23.59f, 10.31f, 21.47f, 12.43f)
                close()
            }
        }.build()

        return _AxeBattle!!
    }

@Suppress("ObjectPropertyName")
private var _AxeBattle: ImageVector? = null
