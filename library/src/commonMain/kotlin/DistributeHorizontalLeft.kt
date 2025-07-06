package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DistributeHorizontalLeft: ImageVector
    get() {
        if (_DistributeHorizontalLeft != null) {
            return _DistributeHorizontalLeft!!
        }
        _DistributeHorizontalLeft = ImageVector.Builder(
            name = "DistributeHorizontalLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                moveTo(5f, 2f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _DistributeHorizontalLeft!!
    }

@Suppress("ObjectPropertyName")
private var _DistributeHorizontalLeft: ImageVector? = null
