package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Lighthouse: ImageVector
    get() {
        if (_Lighthouse != null) {
            return _Lighthouse!!
        }
        _Lighthouse = ImageVector.Builder(
            name = "Lighthouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                lineTo(12f, 1f)
                lineTo(16f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(14.74f)
                lineTo(8.44f, 13.64f)
                lineTo(9f, 10f)
                horizontalLineTo(8f)
                moveTo(13f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                moveTo(7f, 23f)
                lineTo(7.04f, 22.76f)
                lineTo(16.15f, 17.5f)
                lineTo(16.67f, 20.88f)
                lineTo(13f, 23f)
                horizontalLineTo(7f)
                moveTo(8.05f, 16.17f)
                lineTo(15.31f, 12f)
                lineTo(15.83f, 15.37f)
                lineTo(7.43f, 20.22f)
                lineTo(8.05f, 16.17f)
                close()
            }
        }.build()

        return _Lighthouse!!
    }

@Suppress("ObjectPropertyName")
private var _Lighthouse: ImageVector? = null
