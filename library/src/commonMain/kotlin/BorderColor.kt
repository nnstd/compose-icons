package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BorderColor: ImageVector
    get() {
        if (_BorderColor != null) {
            return _BorderColor!!
        }
        _BorderColor = ImageVector.Builder(
            name = "BorderColor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.71f, 4.04f)
                curveTo(21.1f, 3.65f, 21.1f, 3f, 20.71f, 2.63f)
                lineTo(18.37f, 0.29f)
                curveTo(18f, -0.1f, 17.35f, -0.1f, 16.96f, 0.29f)
                lineTo(15f, 2.25f)
                lineTo(18.75f, 6f)
                moveTo(17.75f, 7f)
                lineTo(14f, 3.25f)
                lineTo(4f, 13.25f)
                verticalLineTo(17f)
                horizontalLineTo(7.75f)
                lineTo(17.75f, 7f)
                close()
            }
        }.build()

        return _BorderColor!!
    }

@Suppress("ObjectPropertyName")
private var _BorderColor: ImageVector? = null
