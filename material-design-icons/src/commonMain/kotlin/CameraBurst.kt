package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraBurst: ImageVector
    get() {
        if (_CameraBurst != null) {
            return _CameraBurst!!
        }
        _CameraBurst = ImageVector.Builder(
            name = "CameraBurst",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(1f)
                verticalLineTo(5f)
                moveTo(5f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                moveTo(22f, 5f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 6f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 19f)
                horizontalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 18f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 5f)
                moveTo(11f, 17f)
                lineTo(13.5f, 13.85f)
                lineTo(15.29f, 16f)
                lineTo(17.79f, 12.78f)
                lineTo(21f, 17f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _CameraBurst!!
    }

@Suppress("ObjectPropertyName")
private var _CameraBurst: ImageVector? = null
