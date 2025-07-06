package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormTextarea: ImageVector
    get() {
        if (_FormTextarea != null) {
            return _FormTextarea!!
        }
        _FormTextarea = ImageVector.Builder(
            name = "FormTextarea",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                horizontalLineTo(4f)
                verticalLineTo(23f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                moveTo(23f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                horizontalLineTo(17.5f)
                curveTo(17f, 2f, 16f, 2.45f, 16f, 3f)
                curveTo(16f, 2.45f, 15.05f, 2f, 14.5f, 2f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 20f)
                horizontalLineTo(12f)
                verticalLineTo(22f)
                horizontalLineTo(14.5f)
                curveTo(15.05f, 22f, 16f, 21.55f, 16f, 21f)
                curveTo(16f, 21.55f, 16.95f, 22f, 17.5f, 22f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 19f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _FormTextarea!!
    }

@Suppress("ObjectPropertyName")
private var _FormTextarea: ImageVector? = null
