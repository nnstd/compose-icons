package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftXboxControllerView: ImageVector
    get() {
        if (_MicrosoftXboxControllerView != null) {
            return _MicrosoftXboxControllerView!!
        }
        _MicrosoftXboxControllerView = ImageVector.Builder(
            name = "MicrosoftXboxControllerView",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.5f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(6f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                moveTo(9f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                moveTo(11f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _MicrosoftXboxControllerView!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftXboxControllerView: ImageVector? = null
