package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeleteVariant: ImageVector
    get() {
        if (_DeleteVariant != null) {
            return _DeleteVariant!!
        }
        _DeleteVariant = ImageVector.Builder(
            name = "DeleteVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.03f, 3f)
                lineTo(18f, 20.31f)
                curveTo(17.83f, 21.27f, 17f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(7f, 22f, 6.17f, 21.27f, 6f, 20.31f)
                lineTo(2.97f, 3f)
                horizontalLineTo(21.03f)
                moveTo(5.36f, 5f)
                lineTo(8f, 20f)
                horizontalLineTo(16f)
                lineTo(18.64f, 5f)
                horizontalLineTo(5.36f)
                moveTo(9f, 18f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                moveTo(13f, 13.18f)
                lineTo(9.82f, 10f)
                lineTo(13f, 6.82f)
                lineTo(16.18f, 10f)
                lineTo(13f, 13.18f)
                close()
            }
        }.build()

        return _DeleteVariant!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteVariant: ImageVector? = null
