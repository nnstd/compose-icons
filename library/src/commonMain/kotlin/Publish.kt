package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Publish: ImageVector
    get() {
        if (_Publish != null) {
            return _Publish!!
        }
        _Publish = ImageVector.Builder(
            name = "Publish",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                moveTo(5f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                lineTo(12f, 7f)
                lineTo(5f, 14f)
                close()
            }
        }.build()

        return _Publish!!
    }

@Suppress("ObjectPropertyName")
private var _Publish: ImageVector? = null
