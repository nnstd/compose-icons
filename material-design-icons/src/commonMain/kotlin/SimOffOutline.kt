package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SimOffOutline: ImageVector
    get() {
        if (_SimOffOutline != null) {
            return _SimOffOutline!!
        }
        _SimOffOutline = ImageVector.Builder(
            name = "SimOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(5.06f, 6.95f)
                lineTo(4f, 8f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(18.58f, 22f, 19.1f, 21.75f, 19.46f, 21.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(8.83f)
                lineTo(6.47f, 8.36f)
                lineTo(18f, 19.89f)
                verticalLineTo(20f)
                moveTo(10.83f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(14.8f)
                lineTo(20f, 16.8f)
                verticalLineTo(4f)
                curveTo(20f, 2.9f, 19.11f, 2f, 18f, 2f)
                horizontalLineTo(10f)
                lineTo(7.6f, 4.4f)
                lineTo(9f, 5.81f)
                lineTo(10.83f, 4f)
                close()
            }
        }.build()

        return _SimOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SimOffOutline: ImageVector? = null
