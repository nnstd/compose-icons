package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftXboxControllerMenu: ImageVector
    get() {
        if (_MicrosoftXboxControllerMenu != null) {
            return _MicrosoftXboxControllerMenu!!
        }
        _MicrosoftXboxControllerMenu = ImageVector.Builder(
            name = "MicrosoftXboxControllerMenu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(6f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                moveTo(6f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                moveTo(6f, 15f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _MicrosoftXboxControllerMenu!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftXboxControllerMenu: ImageVector? = null
