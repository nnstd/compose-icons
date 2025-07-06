package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurtainsClosed: ImageVector
    get() {
        if (_CurtainsClosed != null) {
            return _CurtainsClosed!!
        }
        _CurtainsClosed = ImageVector.Builder(
            name = "CurtainsClosed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 3f)
                horizontalLineTo(1f)
                verticalLineTo(1f)
                horizontalLineTo(23f)
                verticalLineTo(3f)
                moveTo(2f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                moveTo(22f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _CurtainsClosed!!
    }

@Suppress("ObjectPropertyName")
private var _CurtainsClosed: ImageVector? = null
