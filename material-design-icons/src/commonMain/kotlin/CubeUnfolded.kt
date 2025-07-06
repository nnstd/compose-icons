package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CubeUnfolded: ImageVector
    get() {
        if (_CubeUnfolded != null) {
            return _CubeUnfolded!!
        }
        _CubeUnfolded = ImageVector.Builder(
            name = "CubeUnfolded",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 9f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(23f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                moveTo(16f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                moveTo(8f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                moveTo(6f, 14f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                moveTo(18f, 11f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                moveTo(13f, 11f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                moveTo(8f, 11f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _CubeUnfolded!!
    }

@Suppress("ObjectPropertyName")
private var _CubeUnfolded: ImageVector? = null
