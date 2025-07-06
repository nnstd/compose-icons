package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DistributeVerticalCenter: ImageVector
    get() {
        if (_DistributeVerticalCenter != null) {
            return _DistributeVerticalCenter!!
        }
        _DistributeVerticalCenter = ImageVector.Builder(
            name = "DistributeVerticalCenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                moveTo(2f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _DistributeVerticalCenter!!
    }

@Suppress("ObjectPropertyName")
private var _DistributeVerticalCenter: ImageVector? = null
