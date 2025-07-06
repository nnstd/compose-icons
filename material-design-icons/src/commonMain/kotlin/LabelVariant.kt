package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LabelVariant: ImageVector
    get() {
        if (_LabelVariant != null) {
            return _LabelVariant!!
        }
        _LabelVariant = ImageVector.Builder(
            name = "LabelVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 19f)
                lineTo(8.34f, 12f)
                lineTo(3.5f, 5f)
                horizontalLineTo(14.5f)
                curveTo(15.17f, 5f, 15.72f, 5.3f, 16.13f, 5.86f)
                lineTo(20.5f, 12f)
                lineTo(16.13f, 18.14f)
                curveTo(15.72f, 18.7f, 15.17f, 19f, 14.5f, 19f)
                horizontalLineTo(3.5f)
                close()
            }
        }.build()

        return _LabelVariant!!
    }

@Suppress("ObjectPropertyName")
private var _LabelVariant: ImageVector? = null
