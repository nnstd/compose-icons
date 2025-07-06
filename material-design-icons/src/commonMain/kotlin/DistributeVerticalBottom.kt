package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DistributeVerticalBottom: ImageVector
    get() {
        if (_DistributeVerticalBottom != null) {
            return _DistributeVerticalBottom!!
        }
        _DistributeVerticalBottom = ImageVector.Builder(
            name = "DistributeVerticalBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                moveTo(2f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _DistributeVerticalBottom!!
    }

@Suppress("ObjectPropertyName")
private var _DistributeVerticalBottom: ImageVector? = null
