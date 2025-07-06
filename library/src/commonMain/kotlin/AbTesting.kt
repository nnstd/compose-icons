package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AbTesting: ImageVector
    get() {
        if (_AbTesting != null) {
            return _AbTesting!!
        }
        _AbTesting = ImageVector.Builder(
            name = "AbTesting",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2f)
                horizontalLineTo(4f)
                moveTo(4f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(22f, 15.5f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20f)
                verticalLineTo(18.5f)
                arcTo(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 17f)
                arcTo(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 15.5f)
                moveTo(20f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                moveTo(20f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                moveTo(5.79f, 21.61f)
                lineTo(4.21f, 20.39f)
                lineTo(18.21f, 2.39f)
                lineTo(19.79f, 3.61f)
                close()
            }
        }.build()

        return _AbTesting!!
    }

@Suppress("ObjectPropertyName")
private var _AbTesting: ImageVector? = null
