package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormTextboxPassword: ImageVector
    get() {
        if (_FormTextboxPassword != null) {
            return _FormTextboxPassword!!
        }
        _FormTextboxPassword = ImageVector.Builder(
            name = "FormTextboxPassword",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 7f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(17.5f)
                curveTo(16.95f, 22f, 16f, 21.55f, 16f, 21f)
                curveTo(16f, 21.55f, 15.05f, 22f, 14.5f, 22f)
                horizontalLineTo(12f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 19f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 4f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                horizontalLineTo(14.5f)
                curveTo(15.05f, 2f, 16f, 2.45f, 16f, 3f)
                curveTo(16f, 2.45f, 16.95f, 2f, 17.5f, 2f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5f)
                verticalLineTo(7f)
                moveTo(2f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                moveTo(20f, 15f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                moveTo(8.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 12f)
                moveTo(13f, 10.89f)
                curveTo(12.39f, 10.33f, 11.44f, 10.38f, 10.88f, 11f)
                curveTo(10.32f, 11.6f, 10.37f, 12.55f, 11f, 13.11f)
                curveTo(11.55f, 13.63f, 12.43f, 13.63f, 13f, 13.11f)
                verticalLineTo(10.89f)
                close()
            }
        }.build()

        return _FormTextboxPassword!!
    }

@Suppress("ObjectPropertyName")
private var _FormTextboxPassword: ImageVector? = null
