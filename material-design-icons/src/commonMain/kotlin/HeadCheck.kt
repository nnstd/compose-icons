package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadCheck: ImageVector
    get() {
        if (_HeadCheck != null) {
            return _HeadCheck!!
        }
        _HeadCheck = ImageVector.Builder(
            name = "HeadCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(9.23f, 3f, 6.19f, 5.95f, 6f, 9.66f)
                lineTo(4.08f, 12.19f)
                curveTo(3.84f, 12.5f, 4.08f, 13f, 4.5f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.89f, 18f, 8f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(16.31f)
                curveTo(18.37f, 15.19f, 20f, 12.8f, 20f, 10f)
                curveTo(20f, 6.14f, 16.88f, 3f, 13f, 3f)
                moveTo(12.47f, 13f)
                lineTo(9f, 9.5f)
                lineTo(10.4f, 8.09f)
                lineTo(12.47f, 10.17f)
                lineTo(16.6f, 6f)
                lineTo(18f, 7.41f)
                lineTo(12.47f, 13f)
                close()
            }
        }.build()

        return _HeadCheck!!
    }

@Suppress("ObjectPropertyName")
private var _HeadCheck: ImageVector? = null
