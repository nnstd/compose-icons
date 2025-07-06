package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorPointEdit: ImageVector
    get() {
        if (_VectorPointEdit != null) {
            return _VectorPointEdit!!
        }
        _VectorPointEdit = ImageVector.Builder(
            name = "VectorPointEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                moveTo(21.2f, 13f)
                curveTo(21.1f, 13f, 20.9f, 13.1f, 20.8f, 13.2f)
                lineTo(19.8f, 14.2f)
                lineTo(21.9f, 16.3f)
                lineTo(22.9f, 15.3f)
                curveTo(23.1f, 15.1f, 23.1f, 14.7f, 22.9f, 14.5f)
                lineTo(21.6f, 13.2f)
                curveTo(21.4f, 13.1f, 21.3f, 13f, 21.2f, 13f)
                moveTo(19.1f, 14.8f)
                lineTo(13f, 20.9f)
                verticalLineTo(23f)
                horizontalLineTo(15.1f)
                lineTo(21.2f, 16.8f)
                lineTo(19.1f, 14.8f)
                close()
            }
        }.build()

        return _VectorPointEdit!!
    }

@Suppress("ObjectPropertyName")
private var _VectorPointEdit: ImageVector? = null
