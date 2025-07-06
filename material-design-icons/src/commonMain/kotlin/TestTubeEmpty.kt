package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TestTubeEmpty: ImageVector
    get() {
        if (_TestTubeEmpty != null) {
            return _TestTubeEmpty!!
        }
        _TestTubeEmpty = ImageVector.Builder(
            name = "TestTubeEmpty",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 18f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                moveTo(14f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 18f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _TestTubeEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _TestTubeEmpty: ImageVector? = null
