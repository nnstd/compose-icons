package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WizardHat: ImageVector
    get() {
        if (_WizardHat != null) {
            return _WizardHat!!
        }
        _WizardHat = ImageVector.Builder(
            name = "WizardHat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 22f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                lineTo(11.1f, 2.6f)
                curveTo(11.3f, 2.2f, 11.6f, 2f, 12f, 2f)
                lineTo(18f, 5f)
                horizontalLineTo(13.9f)
                lineTo(19f, 19f)
                moveTo(10f, 7.5f)
                lineTo(11.04f, 7.97f)
                lineTo(11.5f, 9f)
                lineTo(11.97f, 7.97f)
                lineTo(13f, 7.5f)
                lineTo(11.97f, 7.03f)
                lineTo(11.5f, 6f)
                lineTo(11.04f, 7.03f)
                lineTo(10f, 7.5f)
                moveTo(13f, 15f)
                lineTo(10.94f, 14.07f)
                lineTo(10f, 12f)
                lineTo(9.07f, 14.07f)
                lineTo(7f, 15f)
                lineTo(9.07f, 15.93f)
                lineTo(10f, 18f)
                lineTo(10.94f, 15.93f)
                lineTo(13f, 15f)
                moveTo(13.97f, 11.97f)
                lineTo(15f, 11.5f)
                lineTo(13.97f, 11.03f)
                lineTo(13.5f, 10f)
                lineTo(13.04f, 11.03f)
                lineTo(12f, 11.5f)
                lineTo(13.04f, 11.97f)
                lineTo(13.5f, 13f)
                lineTo(13.97f, 11.97f)
                moveTo(15.97f, 15.97f)
                lineTo(17f, 15.5f)
                lineTo(15.97f, 15.03f)
                lineTo(15.5f, 14f)
                lineTo(15.04f, 15.03f)
                lineTo(14f, 15.5f)
                lineTo(15.04f, 15.97f)
                lineTo(15.5f, 17f)
                lineTo(15.97f, 15.97f)
                close()
            }
        }.build()

        return _WizardHat!!
    }

@Suppress("ObjectPropertyName")
private var _WizardHat: ImageVector? = null
