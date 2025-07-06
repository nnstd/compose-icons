package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PostLamp: ImageVector
    get() {
        if (_PostLamp != null) {
            return _PostLamp!!
        }
        _PostLamp = ImageVector.Builder(
            name = "PostLamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 3f)
                lineTo(13f, 1f)
                horizontalLineTo(11f)
                lineTo(10f, 3f)
                lineTo(5f, 6f)
                horizontalLineTo(7f)
                lineTo(8f, 14f)
                lineTo(10f, 16f)
                lineTo(10.5f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(23f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(13.5f)
                lineTo(14f, 16f)
                lineTo(16f, 14f)
                lineTo(17f, 6f)
                horizontalLineTo(19f)
                lineTo(14f, 3f)
                moveTo(14.16f, 13f)
                horizontalLineTo(9.84f)
                lineTo(9f, 6f)
                horizontalLineTo(15f)
                lineTo(14.16f, 13f)
                close()
            }
        }.build()

        return _PostLamp!!
    }

@Suppress("ObjectPropertyName")
private var _PostLamp: ImageVector? = null
