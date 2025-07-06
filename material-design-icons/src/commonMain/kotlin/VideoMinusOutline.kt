package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoMinusOutline: ImageVector
    get() {
        if (_VideoMinusOutline != null) {
            return _VideoMinusOutline!!
        }
        _VideoMinusOutline = ImageVector.Builder(
            name = "VideoMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                moveTo(16f, 6f)
                horizontalLineTo(4f)
                curveTo(3.45f, 6f, 3f, 6.45f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 17.55f, 3.45f, 18f, 4f, 18f)
                horizontalLineTo(16f)
                curveTo(16.55f, 18f, 17f, 17.55f, 17f, 17f)
                verticalLineTo(13.5f)
                lineTo(21f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(17f, 10.5f)
                verticalLineTo(7f)
                curveTo(17f, 6.45f, 16.55f, 6f, 16f, 6f)
                moveTo(13f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _VideoMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _VideoMinusOutline: ImageVector? = null
