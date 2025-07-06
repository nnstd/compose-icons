package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FloorPlan: ImageVector
    get() {
        if (_FloorPlan != null) {
            return _FloorPlan!!
        }
        _FloorPlan = ImageVector.Builder(
            name = "FloorPlan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 5f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _FloorPlan!!
    }

@Suppress("ObjectPropertyName")
private var _FloorPlan: ImageVector? = null
