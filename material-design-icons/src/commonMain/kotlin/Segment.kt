package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Segment: ImageVector
    get() {
        if (_Segment != null) {
            return _Segment!!
        }
        _Segment = ImageVector.Builder(
            name = "Segment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                moveTo(9f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                moveTo(9f, 18f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
            }
        }.build()

        return _Segment!!
    }

@Suppress("ObjectPropertyName")
private var _Segment: ImageVector? = null
