package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DistributeHorizontalRight: ImageVector
    get() {
        if (_DistributeHorizontalRight != null) {
            return _DistributeHorizontalRight!!
        }
        _DistributeHorizontalRight = ImageVector.Builder(
            name = "DistributeHorizontalRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 17f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                moveTo(19f, 22f)
                horizontalLineTo(21f)
                verticalLineTo(2f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _DistributeHorizontalRight!!
    }

@Suppress("ObjectPropertyName")
private var _DistributeHorizontalRight: ImageVector? = null
